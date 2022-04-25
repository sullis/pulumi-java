// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The protection mode of the collection/file types. Exe/Msi/Script are used for Windows, Executable is used for Linux.
 * 
 */
public final class ProtectionModeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProtectionModeResponse Empty = new ProtectionModeResponse();

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="exe")
    private @Nullable String exe;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<String> exe() {
        return Optional.ofNullable(this.exe);
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="executable")
    private @Nullable String executable;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<String> executable() {
        return Optional.ofNullable(this.executable);
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="msi")
    private @Nullable String msi;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<String> msi() {
        return Optional.ofNullable(this.msi);
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="script")
    private @Nullable String script;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }

    private ProtectionModeResponse() {}

    private ProtectionModeResponse(ProtectionModeResponse $) {
        this.exe = $.exe;
        this.executable = $.executable;
        this.msi = $.msi;
        this.script = $.script;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtectionModeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtectionModeResponse $;

        public Builder() {
            $ = new ProtectionModeResponse();
        }

        public Builder(ProtectionModeResponse defaults) {
            $ = new ProtectionModeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exe The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder exe(@Nullable String exe) {
            $.exe = exe;
            return this;
        }

        /**
         * @param executable The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder executable(@Nullable String executable) {
            $.executable = executable;
            return this;
        }

        /**
         * @param msi The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder msi(@Nullable String msi) {
            $.msi = msi;
            return this;
        }

        /**
         * @param script The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable String script) {
            $.script = script;
            return this;
        }

        public ProtectionModeResponse build() {
            return $;
        }
    }

}
