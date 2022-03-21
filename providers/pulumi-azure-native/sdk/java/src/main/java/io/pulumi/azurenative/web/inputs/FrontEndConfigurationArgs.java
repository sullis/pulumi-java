// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.FrontEndServiceType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FrontEndConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontEndConfigurationArgs Empty = new FrontEndConfigurationArgs();

    @Import(name="kind")
      private final @Nullable Output<FrontEndServiceType> kind;

    public Output<FrontEndServiceType> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    public FrontEndConfigurationArgs(@Nullable Output<FrontEndServiceType> kind) {
        this.kind = kind;
    }

    private FrontEndConfigurationArgs() {
        this.kind = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontEndConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FrontEndServiceType> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontEndConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder kind(@Nullable Output<FrontEndServiceType> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable FrontEndServiceType kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }        public FrontEndConfigurationArgs build() {
            return new FrontEndConfigurationArgs(kind);
        }
    }
}
