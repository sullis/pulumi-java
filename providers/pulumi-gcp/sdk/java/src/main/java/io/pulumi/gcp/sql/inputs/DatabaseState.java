// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseState extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    /**
     * The charset value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    @InputImport(name="charset")
      private final @Nullable Input<String> charset;

    public Input<String> getCharset() {
        return this.charset == null ? Input.empty() : this.charset;
    }

    /**
     * The collation value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    @InputImport(name="collation")
      private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    @InputImport(name="instance")
      private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public DatabaseState(
        @Nullable Input<String> charset,
        @Nullable Input<String> collation,
        @Nullable Input<String> instance,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink) {
        this.charset = charset;
        this.collation = collation;
        this.instance = instance;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
    }

    private DatabaseState() {
        this.charset = Input.empty();
        this.collation = Input.empty();
        this.instance = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> charset;
        private @Nullable Input<String> collation;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.collation = defaults.collation;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setCharset(@Nullable Input<String> charset) {
            this.charset = charset;
            return this;
        }

        public Builder setCharset(@Nullable String charset) {
            this.charset = Input.ofNullable(charset);
            return this;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }
        public DatabaseState build() {
            return new DatabaseState(charset, collation, instance, name, project, selfLink);
        }
    }
}