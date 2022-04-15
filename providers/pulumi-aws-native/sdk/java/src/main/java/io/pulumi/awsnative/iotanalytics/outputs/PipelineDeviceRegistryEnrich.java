// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineDeviceRegistryEnrich {
    private final String attribute;
    private final String name;
    private final @Nullable String next;
    private final String roleArn;
    private final String thingName;

    @CustomType.Constructor
    private PipelineDeviceRegistryEnrich(
        @CustomType.Parameter("attribute") String attribute,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("next") @Nullable String next,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("thingName") String thingName) {
        this.attribute = attribute;
        this.name = name;
        this.next = next;
        this.roleArn = roleArn;
        this.thingName = thingName;
    }

    public String attribute() {
        return this.attribute;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> next() {
        return Optional.ofNullable(this.next);
    }
    public String roleArn() {
        return this.roleArn;
    }
    public String thingName() {
        return this.thingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDeviceRegistryEnrich defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String name;
        private @Nullable String next;
        private String roleArn;
        private String thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDeviceRegistryEnrich defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
    	      this.roleArn = defaults.roleArn;
    	      this.thingName = defaults.thingName;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder thingName(String thingName) {
            this.thingName = Objects.requireNonNull(thingName);
            return this;
        }        public PipelineDeviceRegistryEnrich build() {
            return new PipelineDeviceRegistryEnrich(attribute, name, next, roleArn, thingName);
        }
    }
}
