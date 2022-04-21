// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Foo extends com.pulumi.resources.InvokeArgs {

    public static final Foo Empty = new Foo();

    @Import(name="a", required=true)
    private Boolean a;

    public Boolean a() {
        return this.a;
    }

    @Import(name="b")
    private @Nullable Boolean b;

    public Optional<Boolean> b() {
        return Optional.ofNullable(this.b);
    }

    @Import(name="c", required=true)
    private Integer c;

    public Integer c() {
        return this.c;
    }

    @Import(name="d")
    private @Nullable Integer d;

    public Optional<Integer> d() {
        return Optional.ofNullable(this.d);
    }

    @Import(name="e", required=true)
    private String e;

    public String e() {
        return this.e;
    }

    @Import(name="f")
    private @Nullable String f;

    public Optional<String> f() {
        return Optional.ofNullable(this.f);
    }

    private Foo() {}

    private Foo(Foo $) {
        this.a = $.a;
        this.b = $.b;
        this.c = $.c;
        this.d = $.d;
        this.e = $.e;
        this.f = $.f;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Foo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Foo $;

        public Builder() {
            $ = new Foo();
        }

        public Builder(Foo defaults) {
            $ = new Foo(Objects.requireNonNull(defaults));
        }

        public Builder a(Boolean a) {
            $.a = a;
            return this;
        }

        public Builder b(@Nullable Boolean b) {
            $.b = b;
            return this;
        }

        public Builder c(Integer c) {
            $.c = c;
            return this;
        }

        public Builder d(@Nullable Integer d) {
            $.d = d;
            return this;
        }

        public Builder e(String e) {
            $.e = e;
            return this;
        }

        public Builder f(@Nullable String f) {
            $.f = f;
            return this;
        }

        public Foo build() {
            $.a = Objects.requireNonNull($.a, "expected parameter 'a' to be non-null");
            $.c = Objects.requireNonNull($.c, "expected parameter 'c' to be non-null");
            $.e = Objects.requireNonNull($.e, "expected parameter 'e' to be non-null");
            return $;
        }
    }

}
