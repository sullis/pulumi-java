// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * KeyPolicy assigned to the storage account.
 * 
 */
public final class KeyPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyPolicyResponse Empty = new KeyPolicyResponse();

    /**
     * The key expiration period in days.
     * 
     */
    @Import(name="keyExpirationPeriodInDays", required=true)
    private Integer keyExpirationPeriodInDays;

    /**
     * @return The key expiration period in days.
     * 
     */
    public Integer keyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    private KeyPolicyResponse() {}

    private KeyPolicyResponse(KeyPolicyResponse $) {
        this.keyExpirationPeriodInDays = $.keyExpirationPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyPolicyResponse $;

        public Builder() {
            $ = new KeyPolicyResponse();
        }

        public Builder(KeyPolicyResponse defaults) {
            $ = new KeyPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyExpirationPeriodInDays The key expiration period in days.
         * 
         * @return builder
         * 
         */
        public Builder keyExpirationPeriodInDays(Integer keyExpirationPeriodInDays) {
            $.keyExpirationPeriodInDays = keyExpirationPeriodInDays;
            return this;
        }

        public KeyPolicyResponse build() {
            $.keyExpirationPeriodInDays = Objects.requireNonNull($.keyExpirationPeriodInDays, "expected parameter 'keyExpirationPeriodInDays' to be non-null");
            return $;
        }
    }

}
