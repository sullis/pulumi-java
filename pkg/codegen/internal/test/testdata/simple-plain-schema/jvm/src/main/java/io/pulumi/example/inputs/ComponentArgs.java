// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.example.Utilities;


public final class ComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @InputImport(name="a", required=true)
    private final Boolean a;

    public Boolean getA() {
        return this.a;
    }

    @InputImport(name="b")
    private final @Nullable Boolean b;

    public Optional<Boolean> getB() {
        return this.b == null ? Optional.empty() : Optional.ofNullable(this.b);
    }

    @InputImport(name="bar")
    private final @Nullable io.pulumi.example.inputs.Foo bar;

    public Optional<io.pulumi.example.inputs.Foo> getBar() {
        return this.bar == null ? Optional.empty() : Optional.ofNullable(this.bar);
    }

    @InputImport(name="baz")
    private final @Nullable List<io.pulumi.example.inputs.Foo> baz;

    public List<io.pulumi.example.inputs.Foo> getBaz() {
        return this.baz == null ? List.of() : this.baz;
    }

    @InputImport(name="bazMap")
    private final @Nullable Map<String,io.pulumi.example.inputs.Foo> bazMap;

    public Map<String,io.pulumi.example.inputs.Foo> getBazMap() {
        return this.bazMap == null ? Map.of() : this.bazMap;
    }

    @InputImport(name="c", required=true)
    private final Integer c;

    public Integer getC() {
        return this.c;
    }

    @InputImport(name="d")
    private final @Nullable Integer d;

    public Optional<Integer> getD() {
        return this.d == null ? Optional.empty() : Optional.ofNullable(this.d);
    }

    @InputImport(name="e", required=true)
    private final String e;

    public String getE() {
        return this.e;
    }

    @InputImport(name="f")
    private final @Nullable String f;

    public Optional<String> getF() {
        return this.f == null ? Optional.empty() : Optional.ofNullable(this.f);
    }

    @InputImport(name="foo")
    private final @Nullable Input<io.pulumi.example.inputs.FooArgs> foo;

    public Input<io.pulumi.example.inputs.FooArgs> getFoo() {
        return this.foo == null ? Input.empty() : this.foo;
    }

    public ComponentArgs(
        Boolean a,
        @Nullable Boolean b,
        @Nullable io.pulumi.example.inputs.Foo bar,
        @Nullable List<io.pulumi.example.inputs.Foo> baz,
        @Nullable Map<String,io.pulumi.example.inputs.Foo> bazMap,
        Integer c,
        @Nullable Integer d,
        String e,
        @Nullable String f,
        @Nullable Input<io.pulumi.example.inputs.FooArgs> foo) {
        this.a = Objects.requireNonNull(a, "expected parameter 'a' to be non-null");
        this.b = b;
        this.bar = bar;
        this.baz = baz;
        this.bazMap = bazMap;
        this.c = Objects.requireNonNull(c, "expected parameter 'c' to be non-null");
        this.d = d;
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.f = f;
        this.foo = foo;
    }

    private ComponentArgs() {
        this.a = null;
        this.b = null;
        this.bar = null;
        this.baz = List.of();
        this.bazMap = Map.of();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.foo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean a;
        private @Nullable Boolean b;
        private @Nullable io.pulumi.example.inputs.Foo bar;
        private @Nullable List<io.pulumi.example.inputs.Foo> baz;
        private @Nullable Map<String,io.pulumi.example.inputs.Foo> bazMap;
        private Integer c;
        private @Nullable Integer d;
        private String e;
        private @Nullable String f;
        private @Nullable Input<io.pulumi.example.inputs.FooArgs> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
    	      this.bar = defaults.bar;
    	      this.baz = defaults.baz;
    	      this.bazMap = defaults.bazMap;
    	      this.c = defaults.c;
    	      this.d = defaults.d;
    	      this.e = defaults.e;
    	      this.f = defaults.f;
    	      this.foo = defaults.foo;
        }

        public Builder setA(Boolean a) {
            this.a = Objects.requireNonNull(a);
            return this;
        }

        public Builder setB(@Nullable Boolean b) {
            this.b = b;
            return this;
        }

        public Builder setBar(@Nullable io.pulumi.example.inputs.Foo bar) {
            this.bar = bar;
            return this;
        }

        public Builder setBaz(@Nullable List<io.pulumi.example.inputs.Foo> baz) {
            this.baz = baz;
            return this;
        }

        public Builder setBazMap(@Nullable Map<String,io.pulumi.example.inputs.Foo> bazMap) {
            this.bazMap = bazMap;
            return this;
        }

        public Builder setC(Integer c) {
            this.c = Objects.requireNonNull(c);
            return this;
        }

        public Builder setD(@Nullable Integer d) {
            this.d = d;
            return this;
        }

        public Builder setE(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }

        public Builder setF(@Nullable String f) {
            this.f = f;
            return this;
        }

        public Builder setFoo(@Nullable Input<io.pulumi.example.inputs.FooArgs> foo) {
            this.foo = foo;
            return this;
        }

        public Builder setFoo(@Nullable io.pulumi.example.inputs.FooArgs foo) {
            this.foo = Input.ofNullable(foo);
            return this;
        }

        public ComponentArgs build() {
            return new ComponentArgs(a, b, bar, baz, bazMap, c, d, e, f, foo);
        }
    }
}
