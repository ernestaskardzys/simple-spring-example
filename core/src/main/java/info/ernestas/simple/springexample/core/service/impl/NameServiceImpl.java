package info.ernestas.simple.springexample.core.service.impl;

import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements info.ernestas.simple.springexample.core.service.NameService {

    @Override
    public String getName() {
        return "Foo bar";
    }

}
