package module2.app;

import module1.shared.Apple;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ABean implements Apple {
    @Override
    public String get() {
        return null;
    }
}
