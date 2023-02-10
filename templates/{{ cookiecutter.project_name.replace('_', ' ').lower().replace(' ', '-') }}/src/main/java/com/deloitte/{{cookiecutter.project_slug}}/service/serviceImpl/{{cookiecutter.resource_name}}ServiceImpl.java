package com.deloitte.{{cookiecutter.project_slug}}.service.serviceImpl;

import com.deloitte.{{cookiecutter.project_slug}}.domain.{{cookiecutter.resource_name}};
import com.deloitte.{{cookiecutter.project_slug}}.repository.{{cookiecutter.resource_name}}Repository;
import com.deloitte.{{cookiecutter.project_slug}}.service.{{cookiecutter.resource_name}}Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@Service
public class {{cookiecutter.resource_name}}ServiceImpl implements {{cookiecutter.resource_name}}Service {


    @Autowired
    {{cookiecutter.resource_name}}Repository {{cookiecutter.resource_name|lower}}Repository;

    @Override
    public {{cookiecutter.resource_name}} save{{cookiecutter.resource_name}}({{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        return {{cookiecutter.resource_name|lower}}Repository.save({{cookiecutter.resource_name|lower}});
    }

    @Override
    public {{cookiecutter.resource_name}} update{{cookiecutter.resource_name}}(Long id, {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}) {
        {{cookiecutter.resource_name}} {{cookiecutter.resource_name|lower}}Obj = {{cookiecutter.resource_name|lower}}Repository.findById(id).get();
        //update the required fields
        return {{cookiecutter.resource_name|lower}}Repository.save({{cookiecutter.resource_name|lower}}Obj);
    }

    @Override
    public void delete{{cookiecutter.resource_name}}ById(Long id) {
        {{cookiecutter.resource_name|lower}}Repository.deleteById(id);
    }

    @Override
    public List<{{cookiecutter.resource_name}}>get{{cookiecutter.resource_name}}s() {
        return {{cookiecutter.resource_name|lower}}Repository.findAll();
    }

    @Override
    public {{cookiecutter.resource_name}} get{{cookiecutter.resource_name}}ById(Long id) {
        return {{cookiecutter.resource_name|lower}}Repository.findById(id).get();
    }
}