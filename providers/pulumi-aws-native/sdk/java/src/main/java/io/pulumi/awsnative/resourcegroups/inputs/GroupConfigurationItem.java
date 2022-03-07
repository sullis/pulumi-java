// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.inputs;

import io.pulumi.awsnative.resourcegroups.inputs.GroupConfigurationParameter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupConfigurationItem extends io.pulumi.resources.InvokeArgs {

    public static final GroupConfigurationItem Empty = new GroupConfigurationItem();

    @InputImport(name="parameters")
      private final @Nullable List<GroupConfigurationParameter> parameters;

    public List<GroupConfigurationParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public GroupConfigurationItem(
        @Nullable List<GroupConfigurationParameter> parameters,
        @Nullable String type) {
        this.parameters = parameters;
        this.type = type;
    }

    private GroupConfigurationItem() {
        this.parameters = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupConfigurationItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GroupConfigurationParameter> parameters;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupConfigurationItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable List<GroupConfigurationParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GroupConfigurationItem build() {
            return new GroupConfigurationItem(parameters, type);
        }
    }
}