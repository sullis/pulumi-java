// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupConfigurationParameter {
    private final @Nullable String name;
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private GroupConfigurationParameter(
        @Nullable String name,
        @Nullable List<String> values) {
        this.name = name;
        this.values = values;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupConfigurationParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupConfigurationParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public GroupConfigurationParameter build() {
            return new GroupConfigurationParameter(name, values);
        }
    }
}