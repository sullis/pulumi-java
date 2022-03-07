// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginAccessIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginAccessIdentityArgs Empty = new OriginAccessIdentityArgs();

    /**
     * An optional comment for the origin access identity.
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    public OriginAccessIdentityArgs(@Nullable Input<String> comment) {
        this.comment = comment;
    }

    private OriginAccessIdentityArgs() {
        this.comment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginAccessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> comment;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginAccessIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }
        public OriginAccessIdentityArgs build() {
            return new OriginAccessIdentityArgs(comment);
        }
    }
}