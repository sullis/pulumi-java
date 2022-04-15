// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceAccessControlListConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceAccessControlListConfigurationArgs Empty = new DataSourceAccessControlListConfigurationArgs();

    @Import(name="keyPath")
      private final @Nullable Output<String> keyPath;

    public Output<String> keyPath() {
        return this.keyPath == null ? Codegen.empty() : this.keyPath;
    }

    public DataSourceAccessControlListConfigurationArgs(@Nullable Output<String> keyPath) {
        this.keyPath = keyPath;
    }

    private DataSourceAccessControlListConfigurationArgs() {
        this.keyPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAccessControlListConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAccessControlListConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPath = defaults.keyPath;
        }

        public Builder keyPath(@Nullable Output<String> keyPath) {
            this.keyPath = keyPath;
            return this;
        }
        public Builder keyPath(@Nullable String keyPath) {
            this.keyPath = Codegen.ofNullable(keyPath);
            return this;
        }        public DataSourceAccessControlListConfigurationArgs build() {
            return new DataSourceAccessControlListConfigurationArgs(keyPath);
        }
    }
}
