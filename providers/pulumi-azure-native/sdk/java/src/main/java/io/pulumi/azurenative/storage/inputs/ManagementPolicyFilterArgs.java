// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.TagFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filters limit rule actions to a subset of blobs within the storage account. If multiple filters are defined, a logical AND is performed on all filters.
 * 
 */
public final class ManagementPolicyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyFilterArgs Empty = new ManagementPolicyFilterArgs();

    /**
     * An array of blob index tag based filters, there can be at most 10 tag filters
     * 
     */
    @InputImport(name="blobIndexMatch")
    private final @Nullable Input<List<TagFilterArgs>> blobIndexMatch;

    public Input<List<TagFilterArgs>> getBlobIndexMatch() {
        return this.blobIndexMatch == null ? Input.empty() : this.blobIndexMatch;
    }

    /**
     * An array of predefined enum values. Currently blockBlob supports all tiering and delete actions. Only delete actions are supported for appendBlob.
     * 
     */
    @InputImport(name="blobTypes", required=true)
    private final Input<List<String>> blobTypes;

    public Input<List<String>> getBlobTypes() {
        return this.blobTypes;
    }

    /**
     * An array of strings for prefixes to be match.
     * 
     */
    @InputImport(name="prefixMatch")
    private final @Nullable Input<List<String>> prefixMatch;

    public Input<List<String>> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    public ManagementPolicyFilterArgs(
        @Nullable Input<List<TagFilterArgs>> blobIndexMatch,
        Input<List<String>> blobTypes,
        @Nullable Input<List<String>> prefixMatch) {
        this.blobIndexMatch = blobIndexMatch;
        this.blobTypes = Objects.requireNonNull(blobTypes, "expected parameter 'blobTypes' to be non-null");
        this.prefixMatch = prefixMatch;
    }

    private ManagementPolicyFilterArgs() {
        this.blobIndexMatch = Input.empty();
        this.blobTypes = Input.empty();
        this.prefixMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TagFilterArgs>> blobIndexMatch;
        private Input<List<String>> blobTypes;
        private @Nullable Input<List<String>> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobIndexMatch = defaults.blobIndexMatch;
    	      this.blobTypes = defaults.blobTypes;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder setBlobIndexMatch(@Nullable Input<List<TagFilterArgs>> blobIndexMatch) {
            this.blobIndexMatch = blobIndexMatch;
            return this;
        }

        public Builder setBlobIndexMatch(@Nullable List<TagFilterArgs> blobIndexMatch) {
            this.blobIndexMatch = Input.ofNullable(blobIndexMatch);
            return this;
        }

        public Builder setBlobTypes(Input<List<String>> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }

        public Builder setBlobTypes(List<String> blobTypes) {
            this.blobTypes = Input.of(Objects.requireNonNull(blobTypes));
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<List<String>> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public ManagementPolicyFilterArgs build() {
            return new ManagementPolicyFilterArgs(blobIndexMatch, blobTypes, prefixMatch);
        }
    }
}
