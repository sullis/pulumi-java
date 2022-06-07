// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParameterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParameterPlainArgs Empty = new GetParameterPlainArgs();

    /**
     * The name of the parameter.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the parameter.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    @Import(name="withDecryption")
    private @Nullable Boolean withDecryption;

    /**
     * @return Whether to return decrypted `SecureString` value. Defaults to `true`.
     * 
     */
    public Optional<Boolean> withDecryption() {
        return Optional.ofNullable(this.withDecryption);
    }

    private GetParameterPlainArgs() {}

    private GetParameterPlainArgs(GetParameterPlainArgs $) {
        this.name = $.name;
        this.withDecryption = $.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParameterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParameterPlainArgs $;

        public Builder() {
            $ = new GetParameterPlainArgs();
        }

        public Builder(GetParameterPlainArgs defaults) {
            $ = new GetParameterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param withDecryption Whether to return decrypted `SecureString` value. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder withDecryption(@Nullable Boolean withDecryption) {
            $.withDecryption = withDecryption;
            return this;
        }

        public GetParameterPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
