// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecLoggingAccessLogFile;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecLoggingAccessLog {
    /**
     * The file object to send virtual gateway access logs to.
     * 
     */
    private final @Nullable VirtualGatewaySpecLoggingAccessLogFile file;

    @CustomType.Constructor
    private VirtualGatewaySpecLoggingAccessLog(@CustomType.Parameter("file") @Nullable VirtualGatewaySpecLoggingAccessLogFile file) {
        this.file = file;
    }

    /**
     * The file object to send virtual gateway access logs to.
     * 
    */
    public Optional<VirtualGatewaySpecLoggingAccessLogFile> file() {
        return Optional.ofNullable(this.file);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecLoggingAccessLogFile file;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingAccessLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
        }

        public Builder file(@Nullable VirtualGatewaySpecLoggingAccessLogFile file) {
            this.file = file;
            return this;
        }        public VirtualGatewaySpecLoggingAccessLog build() {
            return new VirtualGatewaySpecLoggingAccessLog(file);
        }
    }
}
