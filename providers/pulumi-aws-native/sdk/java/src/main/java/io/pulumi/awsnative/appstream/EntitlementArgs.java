// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.appstream.inputs.EntitlementAttributeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntitlementArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntitlementArgs Empty = new EntitlementArgs();

    @InputImport(name="appVisibility", required=true)
    private final Input<String> appVisibility;

    public Input<String> getAppVisibility() {
        return this.appVisibility;
    }

    @InputImport(name="attributes", required=true)
    private final Input<List<EntitlementAttributeArgs>> attributes;

    public Input<List<EntitlementAttributeArgs>> getAttributes() {
        return this.attributes;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="stackName", required=true)
    private final Input<String> stackName;

    public Input<String> getStackName() {
        return this.stackName;
    }

    public EntitlementArgs(
        Input<String> appVisibility,
        Input<List<EntitlementAttributeArgs>> attributes,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> stackName) {
        this.appVisibility = Objects.requireNonNull(appVisibility, "expected parameter 'appVisibility' to be non-null");
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.description = description;
        this.name = name;
        this.stackName = Objects.requireNonNull(stackName, "expected parameter 'stackName' to be non-null");
    }

    private EntitlementArgs() {
        this.appVisibility = Input.empty();
        this.attributes = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.stackName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appVisibility;
        private Input<List<EntitlementAttributeArgs>> attributes;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> stackName;

        public Builder() {
    	      // Empty
        }

        public Builder(EntitlementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appVisibility = defaults.appVisibility;
    	      this.attributes = defaults.attributes;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.stackName = defaults.stackName;
        }

        public Builder setAppVisibility(Input<String> appVisibility) {
            this.appVisibility = Objects.requireNonNull(appVisibility);
            return this;
        }

        public Builder setAppVisibility(String appVisibility) {
            this.appVisibility = Input.of(Objects.requireNonNull(appVisibility));
            return this;
        }

        public Builder setAttributes(Input<List<EntitlementAttributeArgs>> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setAttributes(List<EntitlementAttributeArgs> attributes) {
            this.attributes = Input.of(Objects.requireNonNull(attributes));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setStackName(Input<String> stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }

        public Builder setStackName(String stackName) {
            this.stackName = Input.of(Objects.requireNonNull(stackName));
            return this;
        }

        public EntitlementArgs build() {
            return new EntitlementArgs(appVisibility, attributes, description, name, stackName);
        }
    }
}
