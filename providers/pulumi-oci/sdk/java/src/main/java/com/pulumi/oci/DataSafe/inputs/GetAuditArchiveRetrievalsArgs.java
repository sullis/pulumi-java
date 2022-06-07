// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetAuditArchiveRetrievalsFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuditArchiveRetrievalsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuditArchiveRetrievalsArgs Empty = new GetAuditArchiveRetrievalsArgs();

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable Output<String> accessLevel;

    /**
     * @return Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    public Optional<Output<String>> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * OCID of the archive retrieval.
     * 
     */
    @Import(name="auditArchiveRetrievalId")
    private @Nullable Output<String> auditArchiveRetrievalId;

    /**
     * @return OCID of the archive retrieval.
     * 
     */
    public Optional<Output<String>> auditArchiveRetrievalId() {
        return Optional.ofNullable(this.auditArchiveRetrievalId);
    }

    /**
     * A filter to return only resources that match the specified compartment OCID.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Output<Boolean> compartmentIdInSubtree;

    /**
     * @return Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    public Optional<Output<Boolean>> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * A filter to return only resources that match the specified display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the specified display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetAuditArchiveRetrievalsFilterArgs>> filters;

    public Optional<Output<List<GetAuditArchiveRetrievalsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that matches the specified lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A filter to return only resources that matches the specified lifecycle state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of the target associated with the archive retrieval.
     * 
     */
    @Import(name="targetId")
    private @Nullable Output<String> targetId;

    /**
     * @return The OCID of the target associated with the archive retrieval.
     * 
     */
    public Optional<Output<String>> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    /**
     * The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
     * 
     */
    @Import(name="timeOfExpiry")
    private @Nullable Output<String> timeOfExpiry;

    /**
     * @return The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
     * 
     */
    public Optional<Output<String>> timeOfExpiry() {
        return Optional.ofNullable(this.timeOfExpiry);
    }

    private GetAuditArchiveRetrievalsArgs() {}

    private GetAuditArchiveRetrievalsArgs(GetAuditArchiveRetrievalsArgs $) {
        this.accessLevel = $.accessLevel;
        this.auditArchiveRetrievalId = $.auditArchiveRetrievalId;
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
        this.targetId = $.targetId;
        this.timeOfExpiry = $.timeOfExpiry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuditArchiveRetrievalsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuditArchiveRetrievalsArgs $;

        public Builder() {
            $ = new GetAuditArchiveRetrievalsArgs();
        }

        public Builder(GetAuditArchiveRetrievalsArgs defaults) {
            $ = new GetAuditArchiveRetrievalsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable Output<String> accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param accessLevel Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(String accessLevel) {
            return accessLevel(Output.of(accessLevel));
        }

        /**
         * @param auditArchiveRetrievalId OCID of the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder auditArchiveRetrievalId(@Nullable Output<String> auditArchiveRetrievalId) {
            $.auditArchiveRetrievalId = auditArchiveRetrievalId;
            return this;
        }

        /**
         * @param auditArchiveRetrievalId OCID of the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder auditArchiveRetrievalId(String auditArchiveRetrievalId) {
            return auditArchiveRetrievalId(Output.of(auditArchiveRetrievalId));
        }

        /**
         * @param compartmentId A filter to return only resources that match the specified compartment OCID.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId A filter to return only resources that match the specified compartment OCID.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Output<Boolean> compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            return compartmentIdInSubtree(Output.of(compartmentIdInSubtree));
        }

        /**
         * @param displayName A filter to return only resources that match the specified display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the specified display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetAuditArchiveRetrievalsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAuditArchiveRetrievalsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAuditArchiveRetrievalsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that matches the specified lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A filter to return only resources that matches the specified lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param targetId The OCID of the target associated with the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The OCID of the target associated with the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        /**
         * @param timeOfExpiry The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
         * 
         * @return builder
         * 
         */
        public Builder timeOfExpiry(@Nullable Output<String> timeOfExpiry) {
            $.timeOfExpiry = timeOfExpiry;
            return this;
        }

        /**
         * @param timeOfExpiry The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
         * 
         * @return builder
         * 
         */
        public Builder timeOfExpiry(String timeOfExpiry) {
            return timeOfExpiry(Output.of(timeOfExpiry));
        }

        public GetAuditArchiveRetrievalsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
