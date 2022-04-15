// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.IndexJsonTokenTypeConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.IndexJwtTokenTypeConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexUserTokenConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexUserTokenConfigurationArgs Empty = new IndexUserTokenConfigurationArgs();

    @Import(name="jsonTokenTypeConfiguration")
      private final @Nullable Output<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration;

    public Output<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration() {
        return this.jsonTokenTypeConfiguration == null ? Codegen.empty() : this.jsonTokenTypeConfiguration;
    }

    @Import(name="jwtTokenTypeConfiguration")
      private final @Nullable Output<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration;

    public Output<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration() {
        return this.jwtTokenTypeConfiguration == null ? Codegen.empty() : this.jwtTokenTypeConfiguration;
    }

    public IndexUserTokenConfigurationArgs(
        @Nullable Output<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration,
        @Nullable Output<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration) {
        this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
        this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
    }

    private IndexUserTokenConfigurationArgs() {
        this.jsonTokenTypeConfiguration = Codegen.empty();
        this.jwtTokenTypeConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexUserTokenConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration;
        private @Nullable Output<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexUserTokenConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonTokenTypeConfiguration = defaults.jsonTokenTypeConfiguration;
    	      this.jwtTokenTypeConfiguration = defaults.jwtTokenTypeConfiguration;
        }

        public Builder jsonTokenTypeConfiguration(@Nullable Output<IndexJsonTokenTypeConfigurationArgs> jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
            return this;
        }
        public Builder jsonTokenTypeConfiguration(@Nullable IndexJsonTokenTypeConfigurationArgs jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = Codegen.ofNullable(jsonTokenTypeConfiguration);
            return this;
        }
        public Builder jwtTokenTypeConfiguration(@Nullable Output<IndexJwtTokenTypeConfigurationArgs> jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
            return this;
        }
        public Builder jwtTokenTypeConfiguration(@Nullable IndexJwtTokenTypeConfigurationArgs jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = Codegen.ofNullable(jwtTokenTypeConfiguration);
            return this;
        }        public IndexUserTokenConfigurationArgs build() {
            return new IndexUserTokenConfigurationArgs(jsonTokenTypeConfiguration, jwtTokenTypeConfiguration);
        }
    }
}
