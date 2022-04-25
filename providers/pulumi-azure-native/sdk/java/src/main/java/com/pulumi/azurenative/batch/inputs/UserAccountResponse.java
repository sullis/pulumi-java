// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.LinuxUserConfigurationResponse;
import com.pulumi.azurenative.batch.inputs.WindowsUserConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserAccountResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAccountResponse Empty = new UserAccountResponse();

    /**
     * nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    @Import(name="elevationLevel")
    private @Nullable String elevationLevel;

    /**
     * @return nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    public Optional<String> elevationLevel() {
        return Optional.ofNullable(this.elevationLevel);
    }

    /**
     * This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
     */
    @Import(name="linuxUserConfiguration")
    private @Nullable LinuxUserConfigurationResponse linuxUserConfiguration;

    /**
     * @return This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
     */
    public Optional<LinuxUserConfigurationResponse> linuxUserConfiguration() {
        return Optional.ofNullable(this.linuxUserConfiguration);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    /**
     * This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
     */
    @Import(name="windowsUserConfiguration")
    private @Nullable WindowsUserConfigurationResponse windowsUserConfiguration;

    /**
     * @return This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
     */
    public Optional<WindowsUserConfigurationResponse> windowsUserConfiguration() {
        return Optional.ofNullable(this.windowsUserConfiguration);
    }

    private UserAccountResponse() {}

    private UserAccountResponse(UserAccountResponse $) {
        this.elevationLevel = $.elevationLevel;
        this.linuxUserConfiguration = $.linuxUserConfiguration;
        this.name = $.name;
        this.password = $.password;
        this.windowsUserConfiguration = $.windowsUserConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAccountResponse $;

        public Builder() {
            $ = new UserAccountResponse();
        }

        public Builder(UserAccountResponse defaults) {
            $ = new UserAccountResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param elevationLevel nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
         * 
         * @return builder
         * 
         */
        public Builder elevationLevel(@Nullable String elevationLevel) {
            $.elevationLevel = elevationLevel;
            return this;
        }

        /**
         * @param linuxUserConfiguration This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
         * 
         * @return builder
         * 
         */
        public Builder linuxUserConfiguration(@Nullable LinuxUserConfigurationResponse linuxUserConfiguration) {
            $.linuxUserConfiguration = linuxUserConfiguration;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        /**
         * @param windowsUserConfiguration This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
         * 
         * @return builder
         * 
         */
        public Builder windowsUserConfiguration(@Nullable WindowsUserConfigurationResponse windowsUserConfiguration) {
            $.windowsUserConfiguration = windowsUserConfiguration;
            return this;
        }

        public UserAccountResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}
