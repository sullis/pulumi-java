// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.outputs;

import io.pulumi.awsnative.resourcegroups.outputs.GroupConfigurationParameter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupConfigurationItem {
    private final @Nullable List<GroupConfigurationParameter> parameters;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"parameters","type"})
    private GroupConfigurationItem(
        @Nullable List<GroupConfigurationParameter> parameters,
        @Nullable String type) {
        this.parameters = parameters;
        this.type = type;
    }

    public List<GroupConfigurationParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
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
