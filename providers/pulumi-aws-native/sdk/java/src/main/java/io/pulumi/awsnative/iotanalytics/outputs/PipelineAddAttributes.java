// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineAddAttributes {
    private final Object attributes;
    private final String name;
    private final @Nullable String next;

    @CustomType.Constructor
    private PipelineAddAttributes(
        @CustomType.Parameter("attributes") Object attributes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("next") @Nullable String next) {
        this.attributes = attributes;
        this.name = name;
        this.next = next;
    }

    public Object attributes() {
        return this.attributes;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> next() {
        return Optional.ofNullable(this.next);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineAddAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object attributes;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineAddAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder attributes(Object attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }        public PipelineAddAttributes build() {
            return new PipelineAddAttributes(attributes, name, next);
        }
    }
}
