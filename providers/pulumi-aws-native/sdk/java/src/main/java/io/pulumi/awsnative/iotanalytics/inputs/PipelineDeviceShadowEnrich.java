// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineDeviceShadowEnrich extends io.pulumi.resources.InvokeArgs {

    public static final PipelineDeviceShadowEnrich Empty = new PipelineDeviceShadowEnrich();

    @InputImport(name="attribute", required=true)
    private final String attribute;

    public String getAttribute() {
        return this.attribute;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="next")
    private final @Nullable String next;

    public Optional<String> getNext() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    @InputImport(name="roleArn", required=true)
    private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="thingName", required=true)
    private final String thingName;

    public String getThingName() {
        return this.thingName;
    }

    public PipelineDeviceShadowEnrich(
        String attribute,
        String name,
        @Nullable String next,
        String roleArn,
        String thingName) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.thingName = Objects.requireNonNull(thingName, "expected parameter 'thingName' to be non-null");
    }

    private PipelineDeviceShadowEnrich() {
        this.attribute = null;
        this.name = null;
        this.next = null;
        this.roleArn = null;
        this.thingName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDeviceShadowEnrich defaults) {
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

        public Builder(PipelineDeviceShadowEnrich defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
    	      this.roleArn = defaults.roleArn;
    	      this.thingName = defaults.thingName;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNext(@Nullable String next) {
            this.next = next;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setThingName(String thingName) {
            this.thingName = Objects.requireNonNull(thingName);
            return this;
        }

        public PipelineDeviceShadowEnrich build() {
            return new PipelineDeviceShadowEnrich(attribute, name, next, roleArn, thingName);
        }
    }
}
