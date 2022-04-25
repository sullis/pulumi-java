// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.finspace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters of the first Superuser for the FinSpace Environment
 * 
 */
public final class EnvironmentSuperuserParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentSuperuserParametersArgs Empty = new EnvironmentSuperuserParametersArgs();

    /**
     * Email address
     * 
     */
    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    /**
     * @return Email address
     * 
     */
    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * First name
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    /**
     * @return First name
     * 
     */
    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * Last name
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    /**
     * @return Last name
     * 
     */
    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    private EnvironmentSuperuserParametersArgs() {}

    private EnvironmentSuperuserParametersArgs(EnvironmentSuperuserParametersArgs $) {
        this.emailAddress = $.emailAddress;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentSuperuserParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentSuperuserParametersArgs $;

        public Builder() {
            $ = new EnvironmentSuperuserParametersArgs();
        }

        public Builder(EnvironmentSuperuserParametersArgs defaults) {
            $ = new EnvironmentSuperuserParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailAddress Email address
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress Email address
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param firstName First name
         * 
         * @return builder
         * 
         */
        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName First name
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param lastName Last name
         * 
         * @return builder
         * 
         */
        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName Last name
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        public EnvironmentSuperuserParametersArgs build() {
            return $;
        }
    }

}
