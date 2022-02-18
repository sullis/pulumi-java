// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class StorageLensEncryption {
    @OutputCustomType.Constructor({})
    private StorageLensEncryption() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensEncryption defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public StorageLensEncryption build() {
            return new StorageLensEncryption();
        }
    }
}
