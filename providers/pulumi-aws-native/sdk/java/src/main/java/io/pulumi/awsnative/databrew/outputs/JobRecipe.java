// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobRecipe {
    private final String name;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"name","version"})
    private JobRecipe(
        String name,
        @Nullable String version) {
        this.name = Objects.requireNonNull(name);
        this.version = version;
    }

    public String getName() {
        return this.name;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecipe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecipe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public JobRecipe build() {
            return new JobRecipe(name, version);
        }
    }
}
