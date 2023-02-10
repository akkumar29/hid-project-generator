package com.deloitte.{{cookiecutter.project_slug}}.repository;

import com.deloitte.{{cookiecutter.project_slug}}.domain.{{cookiecutter.resource_name}};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface {{cookiecutter.resource_name}}Repository extends JpaRepository<{{cookiecutter.resource_name}}, Long> {
}