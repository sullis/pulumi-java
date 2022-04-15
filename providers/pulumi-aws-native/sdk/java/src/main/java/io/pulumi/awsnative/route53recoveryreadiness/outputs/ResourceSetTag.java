// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResourceSetTag {
    private final String key;
    private final List<String> value;

    @CustomType.Constructor
    private ResourceSetTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") List<String> value) {
        this.key = key;
        this.value = value;
    }

    public String key() {
        return this.key;
    }
    public List<String> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(List<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String... value) {
            return value(List.of(value));
        }        public ResourceSetTag build() {
            return new ResourceSetTag(key, value);
        }
    }
}
