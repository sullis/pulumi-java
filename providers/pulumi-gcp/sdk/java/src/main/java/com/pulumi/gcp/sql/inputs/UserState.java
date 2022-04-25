// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * The deletion policy for the user.
     * Setting `ABANDON` allows the resource to be abandoned rather than deleted. This is useful
     * for Postgres, where users cannot be deleted from the API if they have been granted SQL roles.
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    /**
     * @return The deletion policy for the user.
     * Setting `ABANDON` allows the resource to be abandoned rather than deleted. This is useful
     * for Postgres, where users cannot be deleted from the API if they have been granted SQL roles.
     * 
     */
    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * The host the user can connect from. This is only supported
     * for MySQL instances. Don&#39;t set this field for PostgreSQL instances.
     * Can be an IP address. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The host the user can connect from. This is only supported
     * for MySQL instances. Don&#39;t set this field for PostgreSQL instances.
     * Can be an IP address. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * The name of the user. Changing this forces a new resource
     * to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user. Changing this forces a new resource
     * to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The password for the user. Can be updated. For Postgres
     * instances this is a Required field.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the user. Can be updated. For Postgres
     * instances this is a Required field.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The user type. It determines the method to authenticate the
     * user during login. The default is the database&#39;s built-in user type. Flags
     * include &#34;BUILT_IN&#34;, &#34;CLOUD_IAM_USER&#34;, or &#34;CLOUD_IAM_SERVICE_ACCOUNT&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The user type. It determines the method to authenticate the
     * user during login. The default is the database&#39;s built-in user type. Flags
     * include &#34;BUILT_IN&#34;, &#34;CLOUD_IAM_USER&#34;, or &#34;CLOUD_IAM_SERVICE_ACCOUNT&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.deletionPolicy = $.deletionPolicy;
        this.host = $.host;
        this.instance = $.instance;
        this.name = $.name;
        this.password = $.password;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deletionPolicy The deletion policy for the user.
         * Setting `ABANDON` allows the resource to be abandoned rather than deleted. This is useful
         * for Postgres, where users cannot be deleted from the API if they have been granted SQL roles.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        /**
         * @param deletionPolicy The deletion policy for the user.
         * Setting `ABANDON` allows the resource to be abandoned rather than deleted. This is useful
         * for Postgres, where users cannot be deleted from the API if they have been granted SQL roles.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        /**
         * @param host The host the user can connect from. This is only supported
         * for MySQL instances. Don&#39;t set this field for PostgreSQL instances.
         * Can be an IP address. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host the user can connect from. This is only supported
         * for MySQL instances. Don&#39;t set this field for PostgreSQL instances.
         * Can be an IP address. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param instance The name of the Cloud SQL instance. Changing this
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the Cloud SQL instance. Changing this
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param name The name of the user. Changing this forces a new resource
         * to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user. Changing this forces a new resource
         * to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password for the user. Can be updated. For Postgres
         * instances this is a Required field.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the user. Can be updated. For Postgres
         * instances this is a Required field.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type The user type. It determines the method to authenticate the
         * user during login. The default is the database&#39;s built-in user type. Flags
         * include &#34;BUILT_IN&#34;, &#34;CLOUD_IAM_USER&#34;, or &#34;CLOUD_IAM_SERVICE_ACCOUNT&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The user type. It determines the method to authenticate the
         * user during login. The default is the database&#39;s built-in user type. Flags
         * include &#34;BUILT_IN&#34;, &#34;CLOUD_IAM_USER&#34;, or &#34;CLOUD_IAM_SERVICE_ACCOUNT&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public UserState build() {
            return $;
        }
    }

}
