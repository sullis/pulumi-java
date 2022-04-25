// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    /**
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These statements
     * execute atomically with the creation of the database: if there is an
     * error in any statement, the database is not created.
     * 
     */
    @Import(name="ddls")
    private @Nullable Output<List<String>> ddls;

    /**
     * @return An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These statements
     * execute atomically with the creation of the database: if there is an
     * error in any statement, the database is not created.
     * 
     */
    public Optional<Output<List<String>>> ddls() {
        return Optional.ofNullable(this.ddls);
    }

    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` that would delete the instance will fail.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` that would delete the instance will fail.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * Encryption configuration for the database
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<DatabaseEncryptionConfigGetArgs> encryptionConfig;

    /**
     * @return Encryption configuration for the database
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatabaseEncryptionConfigGetArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * The instance to create the database on.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The instance to create the database on.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * A unique identifier for the database, which cannot be changed after
     * the instance is created. Values are of the form [a-z][-a-z0-9]*[a-z0-9].
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique identifier for the database, which cannot be changed after
     * the instance is created. Values are of the form [a-z][-a-z0-9]*[a-z0-9].
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An explanation of the status of the database.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return An explanation of the status of the database.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private DatabaseState() {}

    private DatabaseState(DatabaseState $) {
        this.ddls = $.ddls;
        this.deletionProtection = $.deletionProtection;
        this.encryptionConfig = $.encryptionConfig;
        this.instance = $.instance;
        this.name = $.name;
        this.project = $.project;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseState $;

        public Builder() {
            $ = new DatabaseState();
        }

        public Builder(DatabaseState defaults) {
            $ = new DatabaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddls An optional list of DDL statements to run inside the newly created
         * database. Statements can create tables, indexes, etc. These statements
         * execute atomically with the creation of the database: if there is an
         * error in any statement, the database is not created.
         * 
         * @return builder
         * 
         */
        public Builder ddls(@Nullable Output<List<String>> ddls) {
            $.ddls = ddls;
            return this;
        }

        /**
         * @param ddls An optional list of DDL statements to run inside the newly created
         * database. Statements can create tables, indexes, etc. These statements
         * execute atomically with the creation of the database: if there is an
         * error in any statement, the database is not created.
         * 
         * @return builder
         * 
         */
        public Builder ddls(List<String> ddls) {
            return ddls(Output.of(ddls));
        }

        /**
         * @param ddls An optional list of DDL statements to run inside the newly created
         * database. Statements can create tables, indexes, etc. These statements
         * execute atomically with the creation of the database: if there is an
         * error in any statement, the database is not created.
         * 
         * @return builder
         * 
         */
        public Builder ddls(String... ddls) {
            return ddls(List.of(ddls));
        }

        /**
         * @param deletionProtection Whether or not to allow the provider to destroy the instance. Unless this field is set to false
         * in state, a `destroy` or `update` that would delete the instance will fail.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection Whether or not to allow the provider to destroy the instance. Unless this field is set to false
         * in state, a `destroy` or `update` that would delete the instance will fail.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param encryptionConfig Encryption configuration for the database
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<DatabaseEncryptionConfigGetArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig Encryption configuration for the database
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(DatabaseEncryptionConfigGetArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param instance The instance to create the database on.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The instance to create the database on.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param name A unique identifier for the database, which cannot be changed after
         * the instance is created. Values are of the form [a-z][-a-z0-9]*[a-z0-9].
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique identifier for the database, which cannot be changed after
         * the instance is created. Values are of the form [a-z][-a-z0-9]*[a-z0-9].
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state An explanation of the status of the database.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state An explanation of the status of the database.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public DatabaseState build() {
            return $;
        }
    }

}
