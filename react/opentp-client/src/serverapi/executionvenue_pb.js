/* eslint-disable */
// source: executionvenue.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var listing_pb = require('./listing_pb.js');
goog.object.extend(proto, listing_pb);
var order_pb = require('./order_pb.js');
goog.object.extend(proto, order_pb);
var modelcommon_pb = require('./modelcommon_pb.js');
goog.object.extend(proto, modelcommon_pb);
goog.exportSymbol('proto.executionvenue.CancelOrderParams', null, global);
goog.exportSymbol('proto.executionvenue.CreateAndRouteOrderParams', null, global);
goog.exportSymbol('proto.executionvenue.ModifyOrderParams', null, global);
goog.exportSymbol('proto.executionvenue.OrderId', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.executionvenue.CreateAndRouteOrderParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.executionvenue.CreateAndRouteOrderParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.executionvenue.CreateAndRouteOrderParams.displayName = 'proto.executionvenue.CreateAndRouteOrderParams';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.executionvenue.OrderId = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.executionvenue.OrderId, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.executionvenue.OrderId.displayName = 'proto.executionvenue.OrderId';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.executionvenue.CancelOrderParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.executionvenue.CancelOrderParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.executionvenue.CancelOrderParams.displayName = 'proto.executionvenue.CancelOrderParams';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.executionvenue.ModifyOrderParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.executionvenue.ModifyOrderParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.executionvenue.ModifyOrderParams.displayName = 'proto.executionvenue.ModifyOrderParams';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.toObject = function(opt_includeInstance) {
  return proto.executionvenue.CreateAndRouteOrderParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.executionvenue.CreateAndRouteOrderParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.CreateAndRouteOrderParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderside: jspb.Message.getFieldWithDefault(msg, 1, 0),
    quantity: (f = msg.getQuantity()) && modelcommon_pb.Decimal64.toObject(includeInstance, f),
    price: (f = msg.getPrice()) && modelcommon_pb.Decimal64.toObject(includeInstance, f),
    listing: (f = msg.getListing()) && listing_pb.Listing.toObject(includeInstance, f),
    originatorid: jspb.Message.getFieldWithDefault(msg, 5, ""),
    originatorref: jspb.Message.getFieldWithDefault(msg, 6, ""),
    rootoriginatorid: jspb.Message.getFieldWithDefault(msg, 7, ""),
    rootoriginatorref: jspb.Message.getFieldWithDefault(msg, 8, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.executionvenue.CreateAndRouteOrderParams}
 */
proto.executionvenue.CreateAndRouteOrderParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.executionvenue.CreateAndRouteOrderParams;
  return proto.executionvenue.CreateAndRouteOrderParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.executionvenue.CreateAndRouteOrderParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.executionvenue.CreateAndRouteOrderParams}
 */
proto.executionvenue.CreateAndRouteOrderParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.model.Side} */ (reader.readEnum());
      msg.setOrderside(value);
      break;
    case 2:
      var value = new modelcommon_pb.Decimal64;
      reader.readMessage(value,modelcommon_pb.Decimal64.deserializeBinaryFromReader);
      msg.setQuantity(value);
      break;
    case 3:
      var value = new modelcommon_pb.Decimal64;
      reader.readMessage(value,modelcommon_pb.Decimal64.deserializeBinaryFromReader);
      msg.setPrice(value);
      break;
    case 4:
      var value = new listing_pb.Listing;
      reader.readMessage(value,listing_pb.Listing.deserializeBinaryFromReader);
      msg.setListing(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setOriginatorid(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setOriginatorref(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setRootoriginatorid(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setRootoriginatorref(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.executionvenue.CreateAndRouteOrderParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.executionvenue.CreateAndRouteOrderParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.CreateAndRouteOrderParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderside();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getQuantity();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      modelcommon_pb.Decimal64.serializeBinaryToWriter
    );
  }
  f = message.getPrice();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      modelcommon_pb.Decimal64.serializeBinaryToWriter
    );
  }
  f = message.getListing();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      listing_pb.Listing.serializeBinaryToWriter
    );
  }
  f = message.getOriginatorid();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getOriginatorref();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getRootoriginatorid();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getRootoriginatorref();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
};


/**
 * optional model.Side orderSide = 1;
 * @return {!proto.model.Side}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getOrderside = function() {
  return /** @type {!proto.model.Side} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.model.Side} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.setOrderside = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional model.Decimal64 quantity = 2;
 * @return {?proto.model.Decimal64}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getQuantity = function() {
  return /** @type{?proto.model.Decimal64} */ (
    jspb.Message.getWrapperField(this, modelcommon_pb.Decimal64, 2));
};


/**
 * @param {?proto.model.Decimal64|undefined} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
*/
proto.executionvenue.CreateAndRouteOrderParams.prototype.setQuantity = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.clearQuantity = function() {
  return this.setQuantity(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.hasQuantity = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional model.Decimal64 price = 3;
 * @return {?proto.model.Decimal64}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getPrice = function() {
  return /** @type{?proto.model.Decimal64} */ (
    jspb.Message.getWrapperField(this, modelcommon_pb.Decimal64, 3));
};


/**
 * @param {?proto.model.Decimal64|undefined} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
*/
proto.executionvenue.CreateAndRouteOrderParams.prototype.setPrice = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.clearPrice = function() {
  return this.setPrice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.hasPrice = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional model.Listing listing = 4;
 * @return {?proto.model.Listing}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getListing = function() {
  return /** @type{?proto.model.Listing} */ (
    jspb.Message.getWrapperField(this, listing_pb.Listing, 4));
};


/**
 * @param {?proto.model.Listing|undefined} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
*/
proto.executionvenue.CreateAndRouteOrderParams.prototype.setListing = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.clearListing = function() {
  return this.setListing(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.hasListing = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string originatorId = 5;
 * @return {string}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getOriginatorid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.setOriginatorid = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string originatorRef = 6;
 * @return {string}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getOriginatorref = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.setOriginatorref = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string rootOriginatorId = 7;
 * @return {string}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getRootoriginatorid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.setRootoriginatorid = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string rootOriginatorRef = 8;
 * @return {string}
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.getRootoriginatorref = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.CreateAndRouteOrderParams} returns this
 */
proto.executionvenue.CreateAndRouteOrderParams.prototype.setRootoriginatorref = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.executionvenue.OrderId.prototype.toObject = function(opt_includeInstance) {
  return proto.executionvenue.OrderId.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.executionvenue.OrderId} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.OrderId.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderid: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.executionvenue.OrderId}
 */
proto.executionvenue.OrderId.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.executionvenue.OrderId;
  return proto.executionvenue.OrderId.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.executionvenue.OrderId} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.executionvenue.OrderId}
 */
proto.executionvenue.OrderId.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrderid(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.executionvenue.OrderId.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.executionvenue.OrderId.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.executionvenue.OrderId} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.OrderId.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string orderId = 1;
 * @return {string}
 */
proto.executionvenue.OrderId.prototype.getOrderid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.OrderId} returns this
 */
proto.executionvenue.OrderId.prototype.setOrderid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.executionvenue.CancelOrderParams.prototype.toObject = function(opt_includeInstance) {
  return proto.executionvenue.CancelOrderParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.executionvenue.CancelOrderParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.CancelOrderParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    listing: (f = msg.getListing()) && listing_pb.Listing.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.executionvenue.CancelOrderParams}
 */
proto.executionvenue.CancelOrderParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.executionvenue.CancelOrderParams;
  return proto.executionvenue.CancelOrderParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.executionvenue.CancelOrderParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.executionvenue.CancelOrderParams}
 */
proto.executionvenue.CancelOrderParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrderid(value);
      break;
    case 2:
      var value = new listing_pb.Listing;
      reader.readMessage(value,listing_pb.Listing.deserializeBinaryFromReader);
      msg.setListing(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.executionvenue.CancelOrderParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.executionvenue.CancelOrderParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.executionvenue.CancelOrderParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.CancelOrderParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getListing();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      listing_pb.Listing.serializeBinaryToWriter
    );
  }
};


/**
 * optional string orderId = 1;
 * @return {string}
 */
proto.executionvenue.CancelOrderParams.prototype.getOrderid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.CancelOrderParams} returns this
 */
proto.executionvenue.CancelOrderParams.prototype.setOrderid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional model.Listing listing = 2;
 * @return {?proto.model.Listing}
 */
proto.executionvenue.CancelOrderParams.prototype.getListing = function() {
  return /** @type{?proto.model.Listing} */ (
    jspb.Message.getWrapperField(this, listing_pb.Listing, 2));
};


/**
 * @param {?proto.model.Listing|undefined} value
 * @return {!proto.executionvenue.CancelOrderParams} returns this
*/
proto.executionvenue.CancelOrderParams.prototype.setListing = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.CancelOrderParams} returns this
 */
proto.executionvenue.CancelOrderParams.prototype.clearListing = function() {
  return this.setListing(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.CancelOrderParams.prototype.hasListing = function() {
  return jspb.Message.getField(this, 2) != null;
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.executionvenue.ModifyOrderParams.prototype.toObject = function(opt_includeInstance) {
  return proto.executionvenue.ModifyOrderParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.executionvenue.ModifyOrderParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.ModifyOrderParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    listing: (f = msg.getListing()) && listing_pb.Listing.toObject(includeInstance, f),
    quantity: (f = msg.getQuantity()) && modelcommon_pb.Decimal64.toObject(includeInstance, f),
    price: (f = msg.getPrice()) && modelcommon_pb.Decimal64.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.executionvenue.ModifyOrderParams}
 */
proto.executionvenue.ModifyOrderParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.executionvenue.ModifyOrderParams;
  return proto.executionvenue.ModifyOrderParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.executionvenue.ModifyOrderParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.executionvenue.ModifyOrderParams}
 */
proto.executionvenue.ModifyOrderParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrderid(value);
      break;
    case 2:
      var value = new listing_pb.Listing;
      reader.readMessage(value,listing_pb.Listing.deserializeBinaryFromReader);
      msg.setListing(value);
      break;
    case 3:
      var value = new modelcommon_pb.Decimal64;
      reader.readMessage(value,modelcommon_pb.Decimal64.deserializeBinaryFromReader);
      msg.setQuantity(value);
      break;
    case 4:
      var value = new modelcommon_pb.Decimal64;
      reader.readMessage(value,modelcommon_pb.Decimal64.deserializeBinaryFromReader);
      msg.setPrice(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.executionvenue.ModifyOrderParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.executionvenue.ModifyOrderParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.executionvenue.ModifyOrderParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.executionvenue.ModifyOrderParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getListing();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      listing_pb.Listing.serializeBinaryToWriter
    );
  }
  f = message.getQuantity();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      modelcommon_pb.Decimal64.serializeBinaryToWriter
    );
  }
  f = message.getPrice();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      modelcommon_pb.Decimal64.serializeBinaryToWriter
    );
  }
};


/**
 * optional string orderId = 1;
 * @return {string}
 */
proto.executionvenue.ModifyOrderParams.prototype.getOrderid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
 */
proto.executionvenue.ModifyOrderParams.prototype.setOrderid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional model.Listing listing = 2;
 * @return {?proto.model.Listing}
 */
proto.executionvenue.ModifyOrderParams.prototype.getListing = function() {
  return /** @type{?proto.model.Listing} */ (
    jspb.Message.getWrapperField(this, listing_pb.Listing, 2));
};


/**
 * @param {?proto.model.Listing|undefined} value
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
*/
proto.executionvenue.ModifyOrderParams.prototype.setListing = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
 */
proto.executionvenue.ModifyOrderParams.prototype.clearListing = function() {
  return this.setListing(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.ModifyOrderParams.prototype.hasListing = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional model.Decimal64 quantity = 3;
 * @return {?proto.model.Decimal64}
 */
proto.executionvenue.ModifyOrderParams.prototype.getQuantity = function() {
  return /** @type{?proto.model.Decimal64} */ (
    jspb.Message.getWrapperField(this, modelcommon_pb.Decimal64, 3));
};


/**
 * @param {?proto.model.Decimal64|undefined} value
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
*/
proto.executionvenue.ModifyOrderParams.prototype.setQuantity = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
 */
proto.executionvenue.ModifyOrderParams.prototype.clearQuantity = function() {
  return this.setQuantity(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.ModifyOrderParams.prototype.hasQuantity = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional model.Decimal64 price = 4;
 * @return {?proto.model.Decimal64}
 */
proto.executionvenue.ModifyOrderParams.prototype.getPrice = function() {
  return /** @type{?proto.model.Decimal64} */ (
    jspb.Message.getWrapperField(this, modelcommon_pb.Decimal64, 4));
};


/**
 * @param {?proto.model.Decimal64|undefined} value
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
*/
proto.executionvenue.ModifyOrderParams.prototype.setPrice = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.executionvenue.ModifyOrderParams} returns this
 */
proto.executionvenue.ModifyOrderParams.prototype.clearPrice = function() {
  return this.setPrice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.executionvenue.ModifyOrderParams.prototype.hasPrice = function() {
  return jspb.Message.getField(this, 4) != null;
};


goog.object.extend(exports, proto.executionvenue);
