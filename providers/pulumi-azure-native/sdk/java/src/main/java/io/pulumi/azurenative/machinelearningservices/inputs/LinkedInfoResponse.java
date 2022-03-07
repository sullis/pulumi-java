// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Info about origin if it is linked.
 * 
 */
public final class LinkedInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedInfoResponse Empty = new LinkedInfoResponse();

    /**
     * LinkedId id.
     * 
     */
    @InputImport(name="linkedId")
      private final @Nullable String linkedId;

    public Optional<String> getLinkedId() {
        return this.linkedId == null ? Optional.empty() : Optional.ofNullable(this.linkedId);
    }

    /**
     * Linked resource name.
     * 
     */
    @InputImport(name="linkedResourceName")
      private final @Nullable String linkedResourceName;

    public Optional<String> getLinkedResourceName() {
        return this.linkedResourceName == null ? Optional.empty() : Optional.ofNullable(this.linkedResourceName);
    }

    /**
     * Datastore origin
     * 
     */
    @InputImport(name="origin")
      private final @Nullable String origin;

    public Optional<String> getOrigin() {
        return this.origin == null ? Optional.empty() : Optional.ofNullable(this.origin);
    }

    public LinkedInfoResponse(
        @Nullable String linkedId,
        @Nullable String linkedResourceName,
        @Nullable String origin) {
        this.linkedId = linkedId;
        this.linkedResourceName = linkedResourceName;
        this.origin = origin;
    }

    private LinkedInfoResponse() {
        this.linkedId = null;
        this.linkedResourceName = null;
        this.origin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkedId;
        private @Nullable String linkedResourceName;
        private @Nullable String origin;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedId = defaults.linkedId;
    	      this.linkedResourceName = defaults.linkedResourceName;
    	      this.origin = defaults.origin;
        }

        public Builder setLinkedId(@Nullable String linkedId) {
            this.linkedId = linkedId;
            return this;
        }

        public Builder setLinkedResourceName(@Nullable String linkedResourceName) {
            this.linkedResourceName = linkedResourceName;
            return this;
        }

        public Builder setOrigin(@Nullable String origin) {
            this.origin = origin;
            return this;
        }
        public LinkedInfoResponse build() {
            return new LinkedInfoResponse(linkedId, linkedResourceName, origin);
        }
    }
}