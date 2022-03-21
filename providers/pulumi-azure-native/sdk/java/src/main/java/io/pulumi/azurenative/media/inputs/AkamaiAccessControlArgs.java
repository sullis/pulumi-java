// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AkamaiSignatureHeaderAuthenticationKeyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Akamai access control
 * 
 */
public final class AkamaiAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final AkamaiAccessControlArgs Empty = new AkamaiAccessControlArgs();

    /**
     * authentication key list
     * 
     */
    @Import(name="akamaiSignatureHeaderAuthenticationKeyList")
      private final @Nullable Output<List<AkamaiSignatureHeaderAuthenticationKeyArgs>> akamaiSignatureHeaderAuthenticationKeyList;

    public Output<List<AkamaiSignatureHeaderAuthenticationKeyArgs>> getAkamaiSignatureHeaderAuthenticationKeyList() {
        return this.akamaiSignatureHeaderAuthenticationKeyList == null ? Output.empty() : this.akamaiSignatureHeaderAuthenticationKeyList;
    }

    public AkamaiAccessControlArgs(@Nullable Output<List<AkamaiSignatureHeaderAuthenticationKeyArgs>> akamaiSignatureHeaderAuthenticationKeyList) {
        this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
    }

    private AkamaiAccessControlArgs() {
        this.akamaiSignatureHeaderAuthenticationKeyList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AkamaiAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AkamaiSignatureHeaderAuthenticationKeyArgs>> akamaiSignatureHeaderAuthenticationKeyList;

        public Builder() {
    	      // Empty
        }

        public Builder(AkamaiAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.akamaiSignatureHeaderAuthenticationKeyList = defaults.akamaiSignatureHeaderAuthenticationKeyList;
        }

        public Builder akamaiSignatureHeaderAuthenticationKeyList(@Nullable Output<List<AkamaiSignatureHeaderAuthenticationKeyArgs>> akamaiSignatureHeaderAuthenticationKeyList) {
            this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
            return this;
        }
        public Builder akamaiSignatureHeaderAuthenticationKeyList(@Nullable List<AkamaiSignatureHeaderAuthenticationKeyArgs> akamaiSignatureHeaderAuthenticationKeyList) {
            this.akamaiSignatureHeaderAuthenticationKeyList = Output.ofNullable(akamaiSignatureHeaderAuthenticationKeyList);
            return this;
        }
        public Builder akamaiSignatureHeaderAuthenticationKeyList(AkamaiSignatureHeaderAuthenticationKeyArgs... akamaiSignatureHeaderAuthenticationKeyList) {
            return akamaiSignatureHeaderAuthenticationKeyList(List.of(akamaiSignatureHeaderAuthenticationKeyList));
        }        public AkamaiAccessControlArgs build() {
            return new AkamaiAccessControlArgs(akamaiSignatureHeaderAuthenticationKeyList);
        }
    }
}
