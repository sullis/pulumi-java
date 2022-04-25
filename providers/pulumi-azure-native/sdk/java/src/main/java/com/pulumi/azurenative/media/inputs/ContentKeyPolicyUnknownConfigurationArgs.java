// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a ContentKeyPolicyConfiguration that is unavailable in the current API version.
 * 
 */
public final class ContentKeyPolicyUnknownConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyUnknownConfigurationArgs Empty = new ContentKeyPolicyUnknownConfigurationArgs();

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyUnknownConfiguration&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyUnknownConfiguration&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private ContentKeyPolicyUnknownConfigurationArgs() {}

    private ContentKeyPolicyUnknownConfigurationArgs(ContentKeyPolicyUnknownConfigurationArgs $) {
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyUnknownConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyUnknownConfigurationArgs $;

        public Builder() {
            $ = new ContentKeyPolicyUnknownConfigurationArgs();
        }

        public Builder(ContentKeyPolicyUnknownConfigurationArgs defaults) {
            $ = new ContentKeyPolicyUnknownConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyUnknownConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyUnknownConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public ContentKeyPolicyUnknownConfigurationArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
