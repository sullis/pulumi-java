// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingAccessLogGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingAccessLogGetArgs Empty = new VirtualGatewaySpecLoggingAccessLogGetArgs();

    /**
     * The file object to send virtual gateway access logs to.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualGatewaySpecLoggingAccessLogFileGetArgs> file;

    public Output<VirtualGatewaySpecLoggingAccessLogFileGetArgs> file() {
        return this.file == null ? Codegen.empty() : this.file;
    }

    public VirtualGatewaySpecLoggingAccessLogGetArgs(@Nullable Output<VirtualGatewaySpecLoggingAccessLogFileGetArgs> file) {
        this.file = file;
    }

    private VirtualGatewaySpecLoggingAccessLogGetArgs() {
        this.file = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLogGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecLoggingAccessLogFileGetArgs> file;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingAccessLogGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
        }

        public Builder file(@Nullable Output<VirtualGatewaySpecLoggingAccessLogFileGetArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualGatewaySpecLoggingAccessLogFileGetArgs file) {
            this.file = Codegen.ofNullable(file);
            return this;
        }        public VirtualGatewaySpecLoggingAccessLogGetArgs build() {
            return new VirtualGatewaySpecLoggingAccessLogGetArgs(file);
        }
    }
}
