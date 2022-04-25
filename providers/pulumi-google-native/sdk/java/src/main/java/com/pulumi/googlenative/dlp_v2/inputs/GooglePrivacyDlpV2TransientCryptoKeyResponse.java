// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Use this to have a random data crypto key generated. It will be discarded after the request finishes.
 * 
 */
public final class GooglePrivacyDlpV2TransientCryptoKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TransientCryptoKeyResponse Empty = new GooglePrivacyDlpV2TransientCryptoKeyResponse();

    /**
     * Name of the key. This is an arbitrary string used to differentiate different keys. A unique key is generated per name: two separate `TransientCryptoKey` protos share the same generated key if their names are the same. When the data crypto key is generated, this name is not used in any way (repeating the api call will result in a different key being generated).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the key. This is an arbitrary string used to differentiate different keys. A unique key is generated per name: two separate `TransientCryptoKey` protos share the same generated key if their names are the same. When the data crypto key is generated, this name is not used in any way (repeating the api call will result in a different key being generated).
     * 
     */
    public String name() {
        return this.name;
    }

    private GooglePrivacyDlpV2TransientCryptoKeyResponse() {}

    private GooglePrivacyDlpV2TransientCryptoKeyResponse(GooglePrivacyDlpV2TransientCryptoKeyResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2TransientCryptoKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2TransientCryptoKeyResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2TransientCryptoKeyResponse();
        }

        public Builder(GooglePrivacyDlpV2TransientCryptoKeyResponse defaults) {
            $ = new GooglePrivacyDlpV2TransientCryptoKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the key. This is an arbitrary string used to differentiate different keys. A unique key is generated per name: two separate `TransientCryptoKey` protos share the same generated key if their names are the same. When the data crypto key is generated, this name is not used in any way (repeating the api call will result in a different key being generated).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GooglePrivacyDlpV2TransientCryptoKeyResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
