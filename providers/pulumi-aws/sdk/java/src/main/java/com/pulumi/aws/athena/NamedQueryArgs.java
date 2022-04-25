// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamedQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedQueryArgs Empty = new NamedQueryArgs();

    /**
     * The database to which the query belongs.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database to which the query belongs.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * A brief explanation of the query. Maximum length of 1024.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A brief explanation of the query. Maximum length of 1024.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The plain language name for the query. Maximum length of 128.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The plain language name for the query. Maximum length of 128.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * The workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    @Import(name="workgroup")
    private @Nullable Output<String> workgroup;

    /**
     * @return The workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    public Optional<Output<String>> workgroup() {
        return Optional.ofNullable(this.workgroup);
    }

    private NamedQueryArgs() {}

    private NamedQueryArgs(NamedQueryArgs $) {
        this.database = $.database;
        this.description = $.description;
        this.name = $.name;
        this.query = $.query;
        this.workgroup = $.workgroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedQueryArgs $;

        public Builder() {
            $ = new NamedQueryArgs();
        }

        public Builder(NamedQueryArgs defaults) {
            $ = new NamedQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database to which the query belongs.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database to which the query belongs.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param description A brief explanation of the query. Maximum length of 1024.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A brief explanation of the query. Maximum length of 1024.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The plain language name for the query. Maximum length of 128.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The plain language name for the query. Maximum length of 128.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param query The text of the query itself. In other words, all query statements. Maximum length of 262144.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The text of the query itself. In other words, all query statements. Maximum length of 262144.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param workgroup The workgroup to which the query belongs. Defaults to `primary`
         * 
         * @return builder
         * 
         */
        public Builder workgroup(@Nullable Output<String> workgroup) {
            $.workgroup = workgroup;
            return this;
        }

        /**
         * @param workgroup The workgroup to which the query belongs. Defaults to `primary`
         * 
         * @return builder
         * 
         */
        public Builder workgroup(String workgroup) {
            return workgroup(Output.of(workgroup));
        }

        public NamedQueryArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}
