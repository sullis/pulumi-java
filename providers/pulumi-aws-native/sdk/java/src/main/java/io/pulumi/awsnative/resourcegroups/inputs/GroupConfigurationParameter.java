// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupConfigurationParameter extends io.pulumi.resources.InvokeArgs {

    public static final GroupConfigurationParameter Empty = new GroupConfigurationParameter();

    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public GroupConfigurationParameter(
        @Nullable String name,
        @Nullable List<String> values) {
        this.name = name;
        this.values = values;
    }

    private GroupConfigurationParameter() {
        this.name = null;
        this.values = List.of();
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

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GroupConfigurationParameter build() {
            return new GroupConfigurationParameter(name, values);
        }
    }
}
