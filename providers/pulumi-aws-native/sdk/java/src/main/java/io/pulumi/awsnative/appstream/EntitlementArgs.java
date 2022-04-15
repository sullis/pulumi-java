// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.appstream.inputs.EntitlementAttributeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntitlementArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntitlementArgs Empty = new EntitlementArgs();

    @Import(name="appVisibility", required=true)
      private final Output<String> appVisibility;

    public Output<String> appVisibility() {
        return this.appVisibility;
    }

    @Import(name="attributes", required=true)
      private final Output<List<EntitlementAttributeArgs>> attributes;

    public Output<List<EntitlementAttributeArgs>> attributes() {
        return this.attributes;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="stackName", required=true)
      private final Output<String> stackName;

    public Output<String> stackName() {
        return this.stackName;
    }

    public EntitlementArgs(
        Output<String> appVisibility,
        Output<List<EntitlementAttributeArgs>> attributes,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> stackName) {
        this.appVisibility = Objects.requireNonNull(appVisibility, "expected parameter 'appVisibility' to be non-null");
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.description = description;
        this.name = name;
        this.stackName = Objects.requireNonNull(stackName, "expected parameter 'stackName' to be non-null");
    }

    private EntitlementArgs() {
        this.appVisibility = Codegen.empty();
        this.attributes = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.stackName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appVisibility;
        private Output<List<EntitlementAttributeArgs>> attributes;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> stackName;

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

        public Builder appVisibility(Output<String> appVisibility) {
            this.appVisibility = Objects.requireNonNull(appVisibility);
            return this;
        }
        public Builder appVisibility(String appVisibility) {
            this.appVisibility = Output.of(Objects.requireNonNull(appVisibility));
            return this;
        }
        public Builder attributes(Output<List<EntitlementAttributeArgs>> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(List<EntitlementAttributeArgs> attributes) {
            this.attributes = Output.of(Objects.requireNonNull(attributes));
            return this;
        }
        public Builder attributes(EntitlementAttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder stackName(Output<String> stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }
        public Builder stackName(String stackName) {
            this.stackName = Output.of(Objects.requireNonNull(stackName));
            return this;
        }        public EntitlementArgs build() {
            return new EntitlementArgs(appVisibility, attributes, description, name, stackName);
        }
    }
}
