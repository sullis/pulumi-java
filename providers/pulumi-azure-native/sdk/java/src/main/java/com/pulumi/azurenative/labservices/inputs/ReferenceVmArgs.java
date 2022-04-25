// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of a Reference Vm
 * 
 */
public final class ReferenceVmArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReferenceVmArgs Empty = new ReferenceVmArgs();

    /**
     * The password of the virtual machine. This will be set to null in GET resource API
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the virtual machine. This will be set to null in GET resource API
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The username of the virtual machine
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The username of the virtual machine
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private ReferenceVmArgs() {}

    private ReferenceVmArgs(ReferenceVmArgs $) {
        this.password = $.password;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReferenceVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReferenceVmArgs $;

        public Builder() {
            $ = new ReferenceVmArgs();
        }

        public Builder(ReferenceVmArgs defaults) {
            $ = new ReferenceVmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password of the virtual machine. This will be set to null in GET resource API
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the virtual machine. This will be set to null in GET resource API
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param userName The username of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The username of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public ReferenceVmArgs build() {
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
