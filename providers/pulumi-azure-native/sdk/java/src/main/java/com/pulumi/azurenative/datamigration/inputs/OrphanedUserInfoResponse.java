// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information of orphaned users on the SQL server database.
 * 
 */
public final class OrphanedUserInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final OrphanedUserInfoResponse Empty = new OrphanedUserInfoResponse();

    /**
     * Parent database of the user
     * 
     */
    @Import(name="databaseName")
    private @Nullable String databaseName;

    /**
     * @return Parent database of the user
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * Name of the orphaned user
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the orphaned user
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private OrphanedUserInfoResponse() {}

    private OrphanedUserInfoResponse(OrphanedUserInfoResponse $) {
        this.databaseName = $.databaseName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrphanedUserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrphanedUserInfoResponse $;

        public Builder() {
            $ = new OrphanedUserInfoResponse();
        }

        public Builder(OrphanedUserInfoResponse defaults) {
            $ = new OrphanedUserInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName Parent database of the user
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param name Name of the orphaned user
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public OrphanedUserInfoResponse build() {
            return $;
        }
    }

}
