// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The secret management attributes.
 * 
 */
public final class SecretAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretAttributesArgs Empty = new SecretAttributesArgs();

    /**
     * Determines whether the object is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Determines whether the object is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="expires")
    private @Nullable Output<Integer> expires;

    /**
     * @return Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    public Optional<Output<Integer>> expires() {
        return Optional.ofNullable(this.expires);
    }

    /**
     * Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="notBefore")
    private @Nullable Output<Integer> notBefore;

    /**
     * @return Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    public Optional<Output<Integer>> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }

    private SecretAttributesArgs() {}

    private SecretAttributesArgs(SecretAttributesArgs $) {
        this.enabled = $.enabled;
        this.expires = $.expires;
        this.notBefore = $.notBefore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretAttributesArgs $;

        public Builder() {
            $ = new SecretAttributesArgs();
        }

        public Builder(SecretAttributesArgs defaults) {
            $ = new SecretAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Determines whether the object is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Determines whether the object is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expires Expiry date in seconds since 1970-01-01T00:00:00Z.
         * 
         * @return builder
         * 
         */
        public Builder expires(@Nullable Output<Integer> expires) {
            $.expires = expires;
            return this;
        }

        /**
         * @param expires Expiry date in seconds since 1970-01-01T00:00:00Z.
         * 
         * @return builder
         * 
         */
        public Builder expires(Integer expires) {
            return expires(Output.of(expires));
        }

        /**
         * @param notBefore Not before date in seconds since 1970-01-01T00:00:00Z.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(@Nullable Output<Integer> notBefore) {
            $.notBefore = notBefore;
            return this;
        }

        /**
         * @param notBefore Not before date in seconds since 1970-01-01T00:00:00Z.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(Integer notBefore) {
            return notBefore(Output.of(notBefore));
        }

        public SecretAttributesArgs build() {
            return $;
        }
    }

}
