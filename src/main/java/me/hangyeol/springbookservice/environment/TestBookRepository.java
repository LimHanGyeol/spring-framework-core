package me.hangyeol.springbookservice.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class TestBookRepository implements TestRepository{
}
