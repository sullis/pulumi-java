// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.TagPropertyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The LegalHold property of a blob container.
 * 
 */
public final class LegalHoldPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LegalHoldPropertiesResponse Empty = new LegalHoldPropertiesResponse();

    /**
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
     */
    @InputImport(name="hasLegalHold", required=true)
    private final Boolean hasLegalHold;

    public Boolean getHasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * The list of LegalHold tags of a blob container.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable List<TagPropertyResponse> tags;

    public List<TagPropertyResponse> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public LegalHoldPropertiesResponse(
        Boolean hasLegalHold,
        @Nullable List<TagPropertyResponse> tags) {
        this.hasLegalHold = Objects.requireNonNull(hasLegalHold, "expected parameter 'hasLegalHold' to be non-null");
        this.tags = tags;
    }

    private LegalHoldPropertiesResponse() {
        this.hasLegalHold = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LegalHoldPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean hasLegalHold;
        private @Nullable List<TagPropertyResponse> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LegalHoldPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasLegalHold = defaults.hasLegalHold;
    	      this.tags = defaults.tags;
        }

        public Builder setHasLegalHold(Boolean hasLegalHold) {
            this.hasLegalHold = Objects.requireNonNull(hasLegalHold);
            return this;
        }

        public Builder setTags(@Nullable List<TagPropertyResponse> tags) {
            this.tags = tags;
            return this;
        }

        public LegalHoldPropertiesResponse build() {
            return new LegalHoldPropertiesResponse(hasLegalHold, tags);
        }
    }
}
