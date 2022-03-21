// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The debug setting.
 * 
 */
public final class DebugSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DebugSettingArgs Empty = new DebugSettingArgs();

    /**
     * Specifies the type of information to log for debugging. The permitted values are none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The default is none. When setting this value, carefully consider the type of information you are passing in during deployment. By logging information about the request or response, you could potentially expose sensitive data that is retrieved through the deployment operations.
     * 
     */
    @Import(name="detailLevel")
      private final @Nullable Output<String> detailLevel;

    public Output<String> getDetailLevel() {
        return this.detailLevel == null ? Output.empty() : this.detailLevel;
    }

    public DebugSettingArgs(@Nullable Output<String> detailLevel) {
        this.detailLevel = detailLevel;
    }

    private DebugSettingArgs() {
        this.detailLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> detailLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(DebugSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detailLevel = defaults.detailLevel;
        }

        public Builder detailLevel(@Nullable Output<String> detailLevel) {
            this.detailLevel = detailLevel;
            return this;
        }
        public Builder detailLevel(@Nullable String detailLevel) {
            this.detailLevel = Output.ofNullable(detailLevel);
            return this;
        }        public DebugSettingArgs build() {
            return new DebugSettingArgs(detailLevel);
        }
    }
}
