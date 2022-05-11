// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueAuthorizationRuleState extends com.pulumi.resources.ResourceArgs {

    public static final QueueAuthorizationRuleState Empty = new QueueAuthorizationRuleState();

    /**
     * Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    @Import(name="listen")
    private @Nullable Output<Boolean> listen;

    /**
     * @return Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> listen() {
        return Optional.ofNullable(this.listen);
    }

    /**
     * Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    @Import(name="manage")
    private @Nullable Output<Boolean> manage;

    /**
     * @return Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> manage() {
        return Optional.ofNullable(this.manage);
    }

    /**
     * Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Primary Connection String for the Authorization Rule.
     * 
     */
    @Import(name="primaryConnectionString")
    private @Nullable Output<String> primaryConnectionString;

    /**
     * @return The Primary Connection String for the Authorization Rule.
     * 
     */
    public Optional<Output<String>> primaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }

    /**
     * The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    @Import(name="primaryConnectionStringAlias")
    private @Nullable Output<String> primaryConnectionStringAlias;

    /**
     * @return The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    public Optional<Output<String>> primaryConnectionStringAlias() {
        return Optional.ofNullable(this.primaryConnectionStringAlias);
    }

    /**
     * The Primary Key for the Authorization Rule.
     * 
     */
    @Import(name="primaryKey")
    private @Nullable Output<String> primaryKey;

    /**
     * @return The Primary Key for the Authorization Rule.
     * 
     */
    public Optional<Output<String>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="queueId")
    private @Nullable Output<String> queueId;

    /**
     * @return Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> queueId() {
        return Optional.ofNullable(this.queueId);
    }

    /**
     * The Secondary Connection String for the Authorization Rule.
     * 
     */
    @Import(name="secondaryConnectionString")
    private @Nullable Output<String> secondaryConnectionString;

    /**
     * @return The Secondary Connection String for the Authorization Rule.
     * 
     */
    public Optional<Output<String>> secondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }

    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    @Import(name="secondaryConnectionStringAlias")
    private @Nullable Output<String> secondaryConnectionStringAlias;

    /**
     * @return The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    public Optional<Output<String>> secondaryConnectionStringAlias() {
        return Optional.ofNullable(this.secondaryConnectionStringAlias);
    }

    /**
     * The Secondary Key for the Authorization Rule.
     * 
     */
    @Import(name="secondaryKey")
    private @Nullable Output<String> secondaryKey;

    /**
     * @return The Secondary Key for the Authorization Rule.
     * 
     */
    public Optional<Output<String>> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    /**
     * Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    @Import(name="send")
    private @Nullable Output<Boolean> send;

    /**
     * @return Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> send() {
        return Optional.ofNullable(this.send);
    }

    private QueueAuthorizationRuleState() {}

    private QueueAuthorizationRuleState(QueueAuthorizationRuleState $) {
        this.listen = $.listen;
        this.manage = $.manage;
        this.name = $.name;
        this.primaryConnectionString = $.primaryConnectionString;
        this.primaryConnectionStringAlias = $.primaryConnectionStringAlias;
        this.primaryKey = $.primaryKey;
        this.queueId = $.queueId;
        this.secondaryConnectionString = $.secondaryConnectionString;
        this.secondaryConnectionStringAlias = $.secondaryConnectionStringAlias;
        this.secondaryKey = $.secondaryKey;
        this.send = $.send;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueAuthorizationRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueAuthorizationRuleState $;

        public Builder() {
            $ = new QueueAuthorizationRuleState();
        }

        public Builder(QueueAuthorizationRuleState defaults) {
            $ = new QueueAuthorizationRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param listen Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(@Nullable Output<Boolean> listen) {
            $.listen = listen;
            return this;
        }

        /**
         * @param listen Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(Boolean listen) {
            return listen(Output.of(listen));
        }

        /**
         * @param manage Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder manage(@Nullable Output<Boolean> manage) {
            $.manage = manage;
            return this;
        }

        /**
         * @param manage Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder manage(Boolean manage) {
            return manage(Output.of(manage));
        }

        /**
         * @param name Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryConnectionString The Primary Connection String for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(@Nullable Output<String> primaryConnectionString) {
            $.primaryConnectionString = primaryConnectionString;
            return this;
        }

        /**
         * @param primaryConnectionString The Primary Connection String for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(String primaryConnectionString) {
            return primaryConnectionString(Output.of(primaryConnectionString));
        }

        /**
         * @param primaryConnectionStringAlias The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionStringAlias(@Nullable Output<String> primaryConnectionStringAlias) {
            $.primaryConnectionStringAlias = primaryConnectionStringAlias;
            return this;
        }

        /**
         * @param primaryConnectionStringAlias The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            return primaryConnectionStringAlias(Output.of(primaryConnectionStringAlias));
        }

        /**
         * @param primaryKey The Primary Key for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The Primary Key for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param queueId Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder queueId(@Nullable Output<String> queueId) {
            $.queueId = queueId;
            return this;
        }

        /**
         * @param queueId Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder queueId(String queueId) {
            return queueId(Output.of(queueId));
        }

        /**
         * @param secondaryConnectionString The Secondary Connection String for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(@Nullable Output<String> secondaryConnectionString) {
            $.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        /**
         * @param secondaryConnectionString The Secondary Connection String for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            return secondaryConnectionString(Output.of(secondaryConnectionString));
        }

        /**
         * @param secondaryConnectionStringAlias The alias Secondary Connection String for the ServiceBus Namespace
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionStringAlias(@Nullable Output<String> secondaryConnectionStringAlias) {
            $.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
            return this;
        }

        /**
         * @param secondaryConnectionStringAlias The alias Secondary Connection String for the ServiceBus Namespace
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            return secondaryConnectionStringAlias(Output.of(secondaryConnectionStringAlias));
        }

        /**
         * @param secondaryKey The Secondary Key for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(@Nullable Output<String> secondaryKey) {
            $.secondaryKey = secondaryKey;
            return this;
        }

        /**
         * @param secondaryKey The Secondary Key for the Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(String secondaryKey) {
            return secondaryKey(Output.of(secondaryKey));
        }

        /**
         * @param send Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(@Nullable Output<Boolean> send) {
            $.send = send;
            return this;
        }

        /**
         * @param send Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(Boolean send) {
            return send(Output.of(send));
        }

        public QueueAuthorizationRuleState build() {
            return $;
        }
    }

}
