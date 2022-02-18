// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Descriptor for what needs to be reviewed
 * 
 */
public final class AccessReviewReviewerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessReviewReviewerArgs Empty = new AccessReviewReviewerArgs();

    /**
     * The id of the reviewer(user/servicePrincipal)
     * 
     */
    @InputImport(name="principalId")
    private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    public AccessReviewReviewerArgs(@Nullable Input<String> principalId) {
        this.principalId = principalId;
    }

    private AccessReviewReviewerArgs() {
        this.principalId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewReviewerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewReviewerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public AccessReviewReviewerArgs build() {
            return new AccessReviewReviewerArgs(principalId);
        }
    }
}
