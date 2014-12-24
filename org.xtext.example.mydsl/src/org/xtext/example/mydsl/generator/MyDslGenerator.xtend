package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import org.xtext.example.mydsl.myDsl.DefaultConstraint
import org.xtext.example.mydsl.myDsl.PersonalConstraint
import org.xtext.example.mydsl.myDsl.Constraint
import org.xtext.example.mydsl.myDsl.DomainModel

public class MyDslGenerator implements IGenerator {
  StringBuilder string //store jave code generated
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    for(domainModel : resource.allContents.toIterable.filter(DomainModel)) {
      string = new StringBuilder()
      string.append("package " + domainModel.packageName + ";\n\n") 
      string.append("import manager.ConstraintsManager;\n")
      string.append("import model.context.Constraint;\n\n") //import information
      string.append("public class AppDemo {\n\n")   
      string.append("static void setDefaultRequirements() {\n")
      for(d : resource.allContents.toIterable.filter(DefaultConstraint)) {
        string.append(d.compile)
        string.append("\n")
      }
      string.append("}\n\n") // the function of setting default constraints
      string.append("static void setPersonalRequirements() {\n")
      for(p : resource.allContents.toIterable.filter(PersonalConstraint)) {
         string.append(p.compile)
         string.append("\n")
      }
      string.append("}\n")
      string.append("}\n") //the function of setting personal constraints
      fsa.generateFile("../src/demo/res/AppDemo.java",string) //write java code into a file located in the specific location
    }
  }
  def compile(DefaultConstraint d) '''
     «FOR c : d.constraints»
        «c.compile»
        ConstraintsManager.addDefaultConstraint("«d.activityName»", «c.constraintName»);
     «ENDFOR»
  ''' //parsing default constraints
  def compile(PersonalConstraint p) '''
     «FOR c : p.constraints»
        «c.compile»
        ConstraintsManager.addPersonalConstraint("«p.personName»", "«p.activityName»", «c.constraintName»);
     «ENDFOR»
  ''' //parsing personal constraints
  def compile(Constraint c)'''
      Constraint «c.constraintName» = new Constraint("«c.featureName»", "«c.judgeFun»", "«c.threshold»");
    ''' //parsing constraints
}