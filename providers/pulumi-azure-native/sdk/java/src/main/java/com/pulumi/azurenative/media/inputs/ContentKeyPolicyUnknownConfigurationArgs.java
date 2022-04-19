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
     * Expected value is '#Microsoft.Media.ContentKeyPolicyUnknownConfiguration'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public ContentKeyPolicyUnknownConfigurationArgs(Output<String> odataType) {
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
    }

    private ContentKeyPolicyUnknownConfigurationArgs() {
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyUnknownConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyUnknownConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public ContentKeyPolicyUnknownConfigurationArgs build() {
            return new ContentKeyPolicyUnknownConfigurationArgs(odataType);
        }
    }
}
