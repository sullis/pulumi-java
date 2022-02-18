// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.awsnative.route53.enums.KeySigningKeyStatus;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeySigningKeyResult {
    /**
     * A string specifying the initial status of the key signing key (KSK). You can set the value to ACTIVE or INACTIVE.
     * 
     */
    private final @Nullable KeySigningKeyStatus status;

    @OutputCustomType.Constructor({"status"})
    private GetKeySigningKeyResult(@Nullable KeySigningKeyStatus status) {
        this.status = status;
    }

    /**
     * A string specifying the initial status of the key signing key (KSK). You can set the value to ACTIVE or INACTIVE.
     * 
     */
    public Optional<KeySigningKeyStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeySigningKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeySigningKeyStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeySigningKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(@Nullable KeySigningKeyStatus status) {
            this.status = status;
            return this;
        }

        public GetKeySigningKeyResult build() {
            return new GetKeySigningKeyResult(status);
        }
    }
}
