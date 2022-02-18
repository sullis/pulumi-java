// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Blob container storage information.
 * 
 */
public final class BlobShareArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobShareArgs Empty = new BlobShareArgs();

    /**
     * SAS URI of Azure Storage Account Container.
     * 
     */
    @InputImport(name="sasUri", required=true)
    private final Input<String> sasUri;

    public Input<String> getSasUri() {
        return this.sasUri;
    }

    public BlobShareArgs(Input<String> sasUri) {
        this.sasUri = Objects.requireNonNull(sasUri, "expected parameter 'sasUri' to be non-null");
    }

    private BlobShareArgs() {
        this.sasUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
        }

        public Builder setSasUri(Input<String> sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }

        public Builder setSasUri(String sasUri) {
            this.sasUri = Input.of(Objects.requireNonNull(sasUri));
            return this;
        }

        public BlobShareArgs build() {
            return new BlobShareArgs(sasUri);
        }
    }
}
