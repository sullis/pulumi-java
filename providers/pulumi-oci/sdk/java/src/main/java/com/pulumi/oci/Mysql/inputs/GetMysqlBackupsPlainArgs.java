// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Mysql.inputs.GetMysqlBackupsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMysqlBackupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMysqlBackupsPlainArgs Empty = new GetMysqlBackupsPlainArgs();

    /**
     * Backup OCID
     * 
     */
    @Import(name="backupId")
    private @Nullable String backupId;

    /**
     * @return Backup OCID
     * 
     */
    public Optional<String> backupId() {
        return Optional.ofNullable(this.backupId);
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Backup creationType
     * 
     */
    @Import(name="creationType")
    private @Nullable String creationType;

    /**
     * @return Backup creationType
     * 
     */
    public Optional<String> creationType() {
        return Optional.ofNullable(this.creationType);
    }

    /**
     * The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="dbSystemId")
    private @Nullable String dbSystemId;

    /**
     * @return The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<String> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }

    /**
     * A filter to return only the resource matching the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only the resource matching the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetMysqlBackupsFilter> filters;

    public Optional<List<GetMysqlBackupsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Backup Lifecycle State
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Backup Lifecycle State
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetMysqlBackupsPlainArgs() {}

    private GetMysqlBackupsPlainArgs(GetMysqlBackupsPlainArgs $) {
        this.backupId = $.backupId;
        this.compartmentId = $.compartmentId;
        this.creationType = $.creationType;
        this.dbSystemId = $.dbSystemId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMysqlBackupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMysqlBackupsPlainArgs $;

        public Builder() {
            $ = new GetMysqlBackupsPlainArgs();
        }

        public Builder(GetMysqlBackupsPlainArgs defaults) {
            $ = new GetMysqlBackupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId Backup OCID
         * 
         * @return builder
         * 
         */
        public Builder backupId(@Nullable String backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param creationType Backup creationType
         * 
         * @return builder
         * 
         */
        public Builder creationType(@Nullable String creationType) {
            $.creationType = creationType;
            return this;
        }

        /**
         * @param dbSystemId The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(@Nullable String dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * @param displayName A filter to return only the resource matching the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetMysqlBackupsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetMysqlBackupsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state Backup Lifecycle State
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetMysqlBackupsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
