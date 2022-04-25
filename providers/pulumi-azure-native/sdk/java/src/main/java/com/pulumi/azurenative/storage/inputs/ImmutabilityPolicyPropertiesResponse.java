// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.UpdateHistoryPropertyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of an ImmutabilityPolicy of a blob container.
 * 
 */
public final class ImmutabilityPolicyPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImmutabilityPolicyPropertiesResponse Empty = new ImmutabilityPolicyPropertiesResponse();

    /**
     * This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
     * 
     */
    @Import(name="allowProtectedAppendWrites")
    private @Nullable Boolean allowProtectedAppendWrites;

    /**
     * @return This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
     * 
     */
    public Optional<Boolean> allowProtectedAppendWrites() {
        return Optional.ofNullable(this.allowProtectedAppendWrites);
    }

    /**
     * ImmutabilityPolicy Etag.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return ImmutabilityPolicy Etag.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    @Import(name="immutabilityPeriodSinceCreationInDays")
    private @Nullable Integer immutabilityPeriodSinceCreationInDays;

    /**
     * @return The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    public Optional<Integer> immutabilityPeriodSinceCreationInDays() {
        return Optional.ofNullable(this.immutabilityPeriodSinceCreationInDays);
    }

    /**
     * The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
     * 
     */
    public String state() {
        return this.state;
    }

    /**
     * The ImmutabilityPolicy update history of the blob container.
     * 
     */
    @Import(name="updateHistory", required=true)
    private List<UpdateHistoryPropertyResponse> updateHistory;

    /**
     * @return The ImmutabilityPolicy update history of the blob container.
     * 
     */
    public List<UpdateHistoryPropertyResponse> updateHistory() {
        return this.updateHistory;
    }

    private ImmutabilityPolicyPropertiesResponse() {}

    private ImmutabilityPolicyPropertiesResponse(ImmutabilityPolicyPropertiesResponse $) {
        this.allowProtectedAppendWrites = $.allowProtectedAppendWrites;
        this.etag = $.etag;
        this.immutabilityPeriodSinceCreationInDays = $.immutabilityPeriodSinceCreationInDays;
        this.state = $.state;
        this.updateHistory = $.updateHistory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImmutabilityPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImmutabilityPolicyPropertiesResponse $;

        public Builder() {
            $ = new ImmutabilityPolicyPropertiesResponse();
        }

        public Builder(ImmutabilityPolicyPropertiesResponse defaults) {
            $ = new ImmutabilityPolicyPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
         * 
         * @return builder
         * 
         */
        public Builder allowProtectedAppendWrites(@Nullable Boolean allowProtectedAppendWrites) {
            $.allowProtectedAppendWrites = allowProtectedAppendWrites;
            return this;
        }

        /**
         * @param etag ImmutabilityPolicy Etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days.
         * 
         * @return builder
         * 
         */
        public Builder immutabilityPeriodSinceCreationInDays(@Nullable Integer immutabilityPeriodSinceCreationInDays) {
            $.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
            return this;
        }

        /**
         * @param state The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        /**
         * @param updateHistory The ImmutabilityPolicy update history of the blob container.
         * 
         * @return builder
         * 
         */
        public Builder updateHistory(List<UpdateHistoryPropertyResponse> updateHistory) {
            $.updateHistory = updateHistory;
            return this;
        }

        /**
         * @param updateHistory The ImmutabilityPolicy update history of the blob container.
         * 
         * @return builder
         * 
         */
        public Builder updateHistory(UpdateHistoryPropertyResponse... updateHistory) {
            return updateHistory(List.of(updateHistory));
        }

        public ImmutabilityPolicyPropertiesResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.updateHistory = Objects.requireNonNull($.updateHistory, "expected parameter 'updateHistory' to be non-null");
            return $;
        }
    }

}
