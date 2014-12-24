package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.DefaultConstraint;
import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.myDsl.PersonalConstraint;

@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  private StringBuilder string;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<DomainModel> _filter = Iterables.<DomainModel>filter(_iterable, DomainModel.class);
    for (final DomainModel domainModel : _filter) {
      {
        StringBuilder _stringBuilder = new StringBuilder();
        this.string = _stringBuilder;
        String _packageName = domainModel.getPackageName();
        String _plus = ("package " + _packageName);
        String _plus_1 = (_plus + ";\n\n");
        this.string.append(_plus_1);
        this.string.append("import manager.ConstraintsManager;\n");
        this.string.append("import model.context.Constraint;\n\n");
        this.string.append("public class AppDemo {\n\n");
        this.string.append("static void setDefaultRequirements() {\n");
        TreeIterator<EObject> _allContents_1 = resource.getAllContents();
        Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
        Iterable<DefaultConstraint> _filter_1 = Iterables.<DefaultConstraint>filter(_iterable_1, DefaultConstraint.class);
        for (final DefaultConstraint d : _filter_1) {
          {
            CharSequence _compile = this.compile(d);
            this.string.append(_compile);
            this.string.append("\n");
          }
        }
        this.string.append("}\n\n");
        this.string.append("static void setPersonalRequirements() {\n");
        TreeIterator<EObject> _allContents_2 = resource.getAllContents();
        Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
        Iterable<PersonalConstraint> _filter_2 = Iterables.<PersonalConstraint>filter(_iterable_2, PersonalConstraint.class);
        for (final PersonalConstraint p : _filter_2) {
          {
            CharSequence _compile = this.compile(p);
            this.string.append(_compile);
            this.string.append("\n");
          }
        }
        this.string.append("}\n");
        this.string.append("}\n");
        fsa.generateFile("../src/demo/res/AppDemo.java", this.string);
      }
    }
  }
  
  public CharSequence compile(final DefaultConstraint d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _constraints = d.getConstraints();
      for(final Constraint c : _constraints) {
        CharSequence _compile = this.compile(c);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
        _builder.append("ConstraintsManager.addDefaultConstraint(\"");
        String _activityName = d.getActivityName();
        _builder.append(_activityName, "");
        _builder.append("\", ");
        String _constraintName = c.getConstraintName();
        _builder.append(_constraintName, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final PersonalConstraint p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _constraints = p.getConstraints();
      for(final Constraint c : _constraints) {
        CharSequence _compile = this.compile(c);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
        _builder.append("ConstraintsManager.addPersonalConstraint(\"");
        String _personName = p.getPersonName();
        _builder.append(_personName, "");
        _builder.append("\", \"");
        String _activityName = p.getActivityName();
        _builder.append(_activityName, "");
        _builder.append("\", ");
        String _constraintName = c.getConstraintName();
        _builder.append(_constraintName, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Constraint ");
    String _constraintName = c.getConstraintName();
    _builder.append(_constraintName, "");
    _builder.append(" = new Constraint(\"");
    String _featureName = c.getFeatureName();
    _builder.append(_featureName, "");
    _builder.append("\", \"");
    String _judgeFun = c.getJudgeFun();
    _builder.append(_judgeFun, "");
    _builder.append("\", \"");
    String _threshold = c.getThreshold();
    _builder.append(_threshold, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
